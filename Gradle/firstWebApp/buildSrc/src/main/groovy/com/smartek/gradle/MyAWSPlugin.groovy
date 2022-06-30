package com.smartek.gradle

import org.gradle.api.*

public class MyAWSPlugin implements Plugin<Project>{
  public void apply(Project project){
    project.task("copyToS3"){
      doLast{
        println "copied to S3"
      }
    }

    project.task("deployToEC2"){
      doLast{
        println "Deployed on AWS"
      }
    }
  }
}