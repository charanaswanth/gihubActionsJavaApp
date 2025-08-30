# githubActionsJavaApp

# Github Actions

GitHub Actions is a built-in CI/CD platform available in Gituhub that lets you automate build and deployment. Workflows files are located in .github/workflows directory in this repository.

# Github hosted runner
![**Github hosted runner**](2.jpg)

# Self hosted Runner (Linux)
![alt text](3.jpg)
# Self hosted Runner (Windows)
![alt text](4.jpg)

# Build and Upload package to Nexus repository
![alt text](8.jpg)
# Docker build and push to Github Container Registry
![alt text](6.jpg)
# Docker build and push to Azure Container Registry
![alt text](5.jpg)
# Upstream and Downstream workflows
![alt text](7.jpg)
1. Linux
    -> mkdir actions-runner && cd actions-runner
    -> curl -o actions-runner-linux-x64-2.328.0.tar.gz -L https://github.com/actions/runner/releases/download/v2.328.0/actions-runner-linux-x64-2.328.0.tar.gz
    -> tar xzf ./actions-runner-linux-x64-2.328.0.tar.gz
    -> ./config.sh --url https://github.com/charanaswanth/githubActionsJavaApp --token <<token>>
    -> Add runner group, name and labels
    -> ./run.sh

2. ghcr.io/<OWNER>/<REPO>:<TAG>


