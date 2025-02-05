def call(String channel, String message, String color = 'good', String tokenCredentialId) {
    slackSend(channel: channel, message: message, color: color, tokenCredentialId: tokenCredentialId)
}
