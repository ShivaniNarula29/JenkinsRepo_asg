def call(String channel, String message, String color = 'good') {
       slackSend(channel: channel,
                 message: message, 
                 color: color)
}
