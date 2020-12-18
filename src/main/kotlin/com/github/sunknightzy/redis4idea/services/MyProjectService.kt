package com.github.sunknightzy.redis4idea.services

import com.intellij.openapi.project.Project
import com.github.sunknightzy.redis4idea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
