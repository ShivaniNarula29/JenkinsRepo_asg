def call(channel, message, color = 'good', tokenCredentialId) {
    slackSend(channel: channel, message: message, color: color, tokenCredentialId: tokenCredentialId)
}
