def cloneRepository(codeBasePath,env) {
    git url: 'https://github.com/ShivaniNarula29/JenkinsRepo_asg.git', branch: ${env}
    echo "Cloned repo from ${codeBasePath}"
}
