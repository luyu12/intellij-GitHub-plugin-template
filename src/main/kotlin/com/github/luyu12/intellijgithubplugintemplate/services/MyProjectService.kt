package com.github.luyu12.intellijgithubplugintemplate.services

import com.github.luyu12.intellijgithubplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
