def call(String environment, String actionMessage, String codeBasePath) {
    // Ensure Ansible environment is properly set up before running
    echo "${actionMessage}: ${codeBasePath}/Ansible_29/Assignment5/playbook.yaml"
    sh 'ls -lrt /home/ubuntu/Ansible_29/Assignment5/playbook.yaml'
    sh "ansible-playbook -i ${codeBasePath}/Ansible_29/Assignment5/prometheus_tool/tests/inventory ${codeBasePath}/Ansible_29/Assignment5/playbook.yaml" 
}
