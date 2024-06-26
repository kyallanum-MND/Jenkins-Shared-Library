def call() {
  sh 'mend_generate_html >> index.html'
  publishHTML (target : [allowMissing: false, alwaysLinkToLastBuild: true, keepAll: true, reportDir: '.', reportFiles: 'index.html', reportName: 'SCA Results', reportTitles: 'Mend SCA Scan Report'])
}
