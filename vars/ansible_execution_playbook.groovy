def call(String environment, String actionMessage, String codeBasePath) {
    // Ensure Ansible environment is properly set up before running
    echo "${codeBasePath}/Ansible_29/Assignment5/playbook.yaml"
    sh 'ls -lrt /home/ubuntu/Ansible_29/Assignment5/playbook.yaml'
    sh "ansible-playbook -i localhost ${codeBasePath}/Ansible_29/Assignment5/playbook.yaml" 
    echo "${actionMessage}"
}
