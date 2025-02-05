// def call(String channel, String message, String color = 'good', String tokenCredentialId) {
//     slackSend(channel: channel, message: message, color: color, tokenCredentialId: tokenCredentialId)
// }
def call(Map params = [:]) {
    // Set default values for missing parameters
    def baseUrl = params.baseUrl ?: ''
    def teamDomain = params.teamDomain ?: 'ninja-socket-crew'
    def channel = params.channel ?: 'ninja-socket-crew'
    def color = params.color ?: 'good'
    def botUser = params.botUser ?: false
    def tokenCredentialId = params.tokenCredentialId ?: 'Slack_update'
    def notifyCommitters = params.notifyCommitters ?: false
    def iconEmoji = params.iconEmoji ?: ''
    def username = params.username ?: ''
    def timestamp = params.timestamp ?: ''
    
    // Slack notification step
    slackSend(channel: channel,
              color: color,
              message: params.message,
              teamDomain: teamDomain,
              tokenCredentialId: tokenCredentialId,
              iconEmoji: iconEmoji,
              username: username,
              timestamp: timestamp)
}
