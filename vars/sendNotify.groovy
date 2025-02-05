def call(channel, message, color = 'good') {
    slackSend(channel: channel, message: message, color: color)
}
