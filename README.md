# githubActionsJavaApp



# Self hosted Runner
1. Linux
    -> mkdir actions-runner && cd actions-runner
    -> curl -o actions-runner-linux-x64-2.328.0.tar.gz -L https://github.com/actions/runner/releases/download/v2.328.0/actions-runner-linux-x64-2.328.0.tar.gz
    -> tar xzf ./actions-runner-linux-x64-2.328.0.tar.gz
    -> ./config.sh --url https://github.com/charanaswanth/githubActionsJavaApp --token <<token>>
    -> Add runner group, name and labels
    -> ./run.sh

2. ghcr.io/<OWNER>/<REPO>:<TAG>
