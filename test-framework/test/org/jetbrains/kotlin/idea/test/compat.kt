/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.test

import com.intellij.codeInsight.daemon.impl.EditorTracker
import com.intellij.openapi.project.Project

// FIX ME WHEN BUNCH 192 REMOVED
fun editorTrackerProjectOpened(project: Project) {
    EditorTracker.getInstance(project)
}