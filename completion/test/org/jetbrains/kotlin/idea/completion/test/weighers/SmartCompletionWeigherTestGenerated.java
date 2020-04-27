/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.completion.test.weighers;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("completion/testData/weighers/smart")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class SmartCompletionWeigherTestGenerated extends AbstractSmartCompletionWeigherTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInSmart() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("completion/testData/weighers/smart"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @TestMetadata("BooleanExpected.kt")
    public void testBooleanExpected() throws Exception {
        runTest("completion/testData/weighers/smart/BooleanExpected.kt");
    }

    @TestMetadata("CallableReference_NothingLast.kt")
    public void testCallableReference_NothingLast() throws Exception {
        runTest("completion/testData/weighers/smart/CallableReference_NothingLast.kt");
    }

    @TestMetadata("CallableReference_NothingLast2.kt")
    public void testCallableReference_NothingLast2() throws Exception {
        runTest("completion/testData/weighers/smart/CallableReference_NothingLast2.kt");
    }

    @TestMetadata("FunctionExpected.kt")
    public void testFunctionExpected() throws Exception {
        runTest("completion/testData/weighers/smart/FunctionExpected.kt");
    }

    @TestMetadata("It.kt")
    public void testIt() throws Exception {
        runTest("completion/testData/weighers/smart/It.kt");
    }

    @TestMetadata("MultipleArgsItem.kt")
    public void testMultipleArgsItem() throws Exception {
        runTest("completion/testData/weighers/smart/MultipleArgsItem.kt");
    }

    @TestMetadata("NameSimilarity1.kt")
    public void testNameSimilarity1() throws Exception {
        runTest("completion/testData/weighers/smart/NameSimilarity1.kt");
    }

    @TestMetadata("NameSimilarity2.kt")
    public void testNameSimilarity2() throws Exception {
        runTest("completion/testData/weighers/smart/NameSimilarity2.kt");
    }

    @TestMetadata("NameSimilarity3.kt")
    public void testNameSimilarity3() throws Exception {
        runTest("completion/testData/weighers/smart/NameSimilarity3.kt");
    }

    @TestMetadata("NameSimilarityAndCompiledParameters.kt")
    public void testNameSimilarityAndCompiledParameters() throws Exception {
        runTest("completion/testData/weighers/smart/NameSimilarityAndCompiledParameters.kt");
    }

    @TestMetadata("NameSimilarityForAssignment.kt")
    public void testNameSimilarityForAssignment() throws Exception {
        runTest("completion/testData/weighers/smart/NameSimilarityForAssignment.kt");
    }

    @TestMetadata("NameSimilarityForBlock.kt")
    public void testNameSimilarityForBlock() throws Exception {
        runTest("completion/testData/weighers/smart/NameSimilarityForBlock.kt");
    }

    @TestMetadata("NameSimilarityForElse.kt")
    public void testNameSimilarityForElse() throws Exception {
        runTest("completion/testData/weighers/smart/NameSimilarityForElse.kt");
    }

    @TestMetadata("NameSimilarityForElvis.kt")
    public void testNameSimilarityForElvis() throws Exception {
        runTest("completion/testData/weighers/smart/NameSimilarityForElvis.kt");
    }

    @TestMetadata("NameSimilarityForEq1.kt")
    public void testNameSimilarityForEq1() throws Exception {
        runTest("completion/testData/weighers/smart/NameSimilarityForEq1.kt");
    }

    @TestMetadata("NameSimilarityForEq2.kt")
    public void testNameSimilarityForEq2() throws Exception {
        runTest("completion/testData/weighers/smart/NameSimilarityForEq2.kt");
    }

    @TestMetadata("NameSimilarityForEq3.kt")
    public void testNameSimilarityForEq3() throws Exception {
        runTest("completion/testData/weighers/smart/NameSimilarityForEq3.kt");
    }

    @TestMetadata("NameSimilarityForEq4.kt")
    public void testNameSimilarityForEq4() throws Exception {
        runTest("completion/testData/weighers/smart/NameSimilarityForEq4.kt");
    }

    @TestMetadata("NameSimilarityForExpressionBody.kt")
    public void testNameSimilarityForExpressionBody() throws Exception {
        runTest("completion/testData/weighers/smart/NameSimilarityForExpressionBody.kt");
    }

    @TestMetadata("NameSimilarityForGetterExpressionBody.kt")
    public void testNameSimilarityForGetterExpressionBody() throws Exception {
        runTest("completion/testData/weighers/smart/NameSimilarityForGetterExpressionBody.kt");
    }

    @TestMetadata("NameSimilarityForGetterReturn.kt")
    public void testNameSimilarityForGetterReturn() throws Exception {
        runTest("completion/testData/weighers/smart/NameSimilarityForGetterReturn.kt");
    }

    @TestMetadata("NameSimilarityForInitializer.kt")
    public void testNameSimilarityForInitializer() throws Exception {
        runTest("completion/testData/weighers/smart/NameSimilarityForInitializer.kt");
    }

    @TestMetadata("NameSimilarityForReturn.kt")
    public void testNameSimilarityForReturn() throws Exception {
        runTest("completion/testData/weighers/smart/NameSimilarityForReturn.kt");
    }

    @TestMetadata("NameSimilarityForThen.kt")
    public void testNameSimilarityForThen() throws Exception {
        runTest("completion/testData/weighers/smart/NameSimilarityForThen.kt");
    }

    @TestMetadata("NameSimilarityForVararg.kt")
    public void testNameSimilarityForVararg() throws Exception {
        runTest("completion/testData/weighers/smart/NameSimilarityForVararg.kt");
    }

    @TestMetadata("NameSimilarityInImplicitlyTypedVarInitializer.kt")
    public void testNameSimilarityInImplicitlyTypedVarInitializer() throws Exception {
        runTest("completion/testData/weighers/smart/NameSimilarityInImplicitlyTypedVarInitializer.kt");
    }

    @TestMetadata("NameSimilaritySorterPlacement.kt")
    public void testNameSimilaritySorterPlacement() throws Exception {
        runTest("completion/testData/weighers/smart/NameSimilaritySorterPlacement.kt");
    }

    @TestMetadata("NoExpectedType.kt")
    public void testNoExpectedType() throws Exception {
        runTest("completion/testData/weighers/smart/NoExpectedType.kt");
    }

    @TestMetadata("NoNameSimilarityForQualifier.kt")
    public void testNoNameSimilarityForQualifier() throws Exception {
        runTest("completion/testData/weighers/smart/NoNameSimilarityForQualifier.kt");
    }

    @TestMetadata("NullableExpected.kt")
    public void testNullableExpected() throws Exception {
        runTest("completion/testData/weighers/smart/NullableExpected.kt");
    }

    @TestMetadata("ReturnValue1.kt")
    public void testReturnValue1() throws Exception {
        runTest("completion/testData/weighers/smart/ReturnValue1.kt");
    }

    @TestMetadata("ReturnValue2.kt")
    public void testReturnValue2() throws Exception {
        runTest("completion/testData/weighers/smart/ReturnValue2.kt");
    }

    @TestMetadata("SmartPriority.kt")
    public void testSmartPriority() throws Exception {
        runTest("completion/testData/weighers/smart/SmartPriority.kt");
    }

    @TestMetadata("SmartPriority2.kt")
    public void testSmartPriority2() throws Exception {
        runTest("completion/testData/weighers/smart/SmartPriority2.kt");
    }

    @TestMetadata("SmartPriority3.kt")
    public void testSmartPriority3() throws Exception {
        runTest("completion/testData/weighers/smart/SmartPriority3.kt");
    }

    @TestMetadata("StaticMemberAndPrefix.kt")
    public void testStaticMemberAndPrefix() throws Exception {
        runTest("completion/testData/weighers/smart/StaticMemberAndPrefix.kt");
    }

    @TestMetadata("SuperMembers.kt")
    public void testSuperMembers() throws Exception {
        runTest("completion/testData/weighers/smart/SuperMembers.kt");
    }
}
