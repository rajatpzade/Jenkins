pipelineJob('scripted-2') {

  description('')

  displayName('scripted-2')

  keepDependencies(false)

  quietPeriod(0)

  checkoutRetryCount(0)

  disabled(false)

  concurrentBuild(false)

  configure { flowdefinition ->

    flowdefinition / 'actions' << 'org.jenkinsci.plugins.pipeline.modeldefinition.actions.DeclarativeJobAction'(plugin:'pipeline-model-definition@2.2118.v31fd5b_9944b_5')

    flowdefinition / 'actions' << 'org.jenkinsci.plugins.pipeline.modeldefinition.actions.DeclarativeJobPropertyTrackerAction'(plugin:'pipeline-model-definition@2.2118.v31fd5b_9944b_5') {

      'jobProperties'()

      'triggers'()

      'parameters'()

      'options'()

    }

    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps@3565.v4b_d9b_8c29a_b_3') {

      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {

        'configVersion'(2)

        'userRemoteConfigs' {

          'hudson.plugins.git.UserRemoteConfig' {

            'url'('https://github.com/rajatpzade/rajatpzade.git')

          }

        }

        'branches' {

          'hudson.plugins.git.BranchSpec' {

            'name'('*/master')

          }

        }

        'doGenerateSubmoduleConfigurations'(false)

        'submoduleCfg'(class:'empty-list')

        'extensions'()

      }

      'scriptPath'('jenkins-pipeline.jdp')

      'lightweight'(true)

    }

  }

}
