def requestUserApproval(keepApprovalStage) {
    if (keepApprovalStage) {
        input message: 'Approve Deployment?', ok: 'Proceed', timeout: 60, timeoutMessage: 'Approval timed out'
    }
}
