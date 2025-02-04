def call(codeBasePath,repoUrl,env) {
    git url: ${repoUrl}, branch: ${env}
    echo "Cloned repo from ${codeBasePath}"
}
