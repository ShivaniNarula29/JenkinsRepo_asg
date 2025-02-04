def call(environment, codeBasePath, actionMessage, prometheusHost) {
    // Ensure Ansible environment is properly set up before running
    sh '''
    export ANSIBLE_CONFIG=ansible.cfg
    ansible-playbook ${codeBasePath}/Ansible_29/Assignment5/playbook.yaml
    '''
    // Call Prometheus after playbook execution to monitor the deployment
    sh """
    curl -X POST -H 'Content-Type: application/json' \
    -d '{"status": "completed", "message": "${actionMessage}", "host": "${prometheusHost}"}' \
    http://prometheus-server.example.com/api/v1/notify-deployment
    """
}
