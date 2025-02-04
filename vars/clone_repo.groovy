def call(String repoUrl, String branch = 'prod') {
    echo "Checking out repository from ${repoUrl} with branch ${branch}"
if (repoUrl == '') {
        error "Repository URL is required"
}
    // Checkout the GitHub repository using the Git plugin
    git branch: branch, url: repoUrl
    echo "Cloned repo from ${codeBasePath}"
}

