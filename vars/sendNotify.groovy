// def call(String channel, String message, String color = 'good') {
//        slackSend(channel: channel,
//                  message: message, 
//                  color: color)
// }
    slackSend (
        channel: channel,
        color: color,
        message: message,
        tokenCredentialId: 'Slack_update', // Make sure this matches your token credential in Jenkins
        iconEmoji: ':rocket:', // Optional: Change this if you'd like a different icon
        username: 'Jenkins' // Optional: Change this to the bot name you want
    )
}
