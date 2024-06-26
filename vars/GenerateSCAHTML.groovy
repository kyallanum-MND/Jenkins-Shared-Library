def call() {
  InstallVirtualEnv()
  RunPythonScript()
}

def InstallVirtualEnv() {
  echo 'Installing Virtual Environment for Python'
  sh 'python3 -m venv venv && source ./venv/bin/activate'
}

def RunPythonScript() {
  sh 'mend_generate_html >> index.html'
  publishHTML (target : [allowMissing: false, alwaysLinkToLastBuild: true, keepAll: true, reportDir: '.', reportFiles: 'index.html', reportName: 'SCA Results', reportTitles: 'Mend SCA Scan Report'])
}
