def call(Map config) {
    stage("Library Call") {
        sh "echo A shared library var has been called."
    }
}