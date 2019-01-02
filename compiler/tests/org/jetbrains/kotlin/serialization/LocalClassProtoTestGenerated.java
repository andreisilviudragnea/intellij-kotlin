/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.serialization;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/serialization/local")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class LocalClassProtoTestGenerated extends AbstractLocalClassProtoTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInLocal() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/serialization/local"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("annotationsInLocalClass.kt")
    public void testAnnotationsInLocalClass() throws Exception {
        runTest("compiler/testData/serialization/local/annotationsInLocalClass.kt");
    }

    @TestMetadata("anonymousObject.kt")
    public void testAnonymousObject() throws Exception {
        runTest("compiler/testData/serialization/local/anonymousObject.kt");
    }

    @TestMetadata("deepInnerChain.kt")
    public void testDeepInnerChain() throws Exception {
        runTest("compiler/testData/serialization/local/deepInnerChain.kt");
    }

    @TestMetadata("innerOfLocal.kt")
    public void testInnerOfLocal() throws Exception {
        runTest("compiler/testData/serialization/local/innerOfLocal.kt");
    }

    @TestMetadata("localClassInSignature.kt")
    public void testLocalClassInSignature() throws Exception {
        runTest("compiler/testData/serialization/local/localClassInSignature.kt");
    }

    @TestMetadata("simpleInMemberFunction.kt")
    public void testSimpleInMemberFunction() throws Exception {
        runTest("compiler/testData/serialization/local/simpleInMemberFunction.kt");
    }

    @TestMetadata("simpleInTopLevelFunction.kt")
    public void testSimpleInTopLevelFunction() throws Exception {
        runTest("compiler/testData/serialization/local/simpleInTopLevelFunction.kt");
    }
}
