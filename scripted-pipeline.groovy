node {  
    stage('pull') { 
        git 'https://github.com/rajatpzade/studentapp.ui.git'
    }
    stage('build') { 
        echo 'build successful'
    }
    stage('test') { 
        echo 'test successful'
    }
    stage('deploy') { 
        echo 'deploy successful'
    }
}