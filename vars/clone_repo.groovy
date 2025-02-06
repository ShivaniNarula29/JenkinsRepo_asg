def call(String codeBasePath,String repoUrl,String env) {
    echo "Git Clone"
    git url: repoUrl, branch: env
    echo "Cloned repo from ${codeBasePath}"
}
