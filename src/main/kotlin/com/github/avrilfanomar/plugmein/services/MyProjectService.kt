package com.github.avrilfanomar.plugmein.services

import com.intellij.openapi.project.Project
import com.github.avrilfanomar.plugmein.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
