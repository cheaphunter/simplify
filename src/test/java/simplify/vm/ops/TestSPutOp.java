package simplify.vm.ops;

import java.util.Map;
import java.util.logging.Logger;

import org.junit.Test;

import simplifier.Main;
import simplify.vm.VMTester;
import util.SparseArray;

public class TestSPutOp {

    private static final String CLASS_NAME = "Lsput_test;";

    @SuppressWarnings("unused")
    private static final Logger log = Logger.getLogger(Main.class.getSimpleName());

    @Test
    public void TestStaticPutInt() {
        SparseArray<Object> initial = VMTester.buildRegisterState(0, 0x42);
        Map<String, Map<String, Object>> classNameToExpectedFieldValue = VMTester.buildClassNameToFieldValue(
                        CLASS_NAME, "myInt:I", 0x42);

        VMTester.testExpectedClassState(CLASS_NAME, "TestStaticPutInt()V", initial, classNameToExpectedFieldValue);
    }

    @Test
    public void TestStaticPutWide() {
        SparseArray<Object> initial = VMTester.buildRegisterState(0, 0xFFFFFFFFFL);
        Map<String, Map<String, Object>> classNameToExpectedFieldValue = VMTester.buildClassNameToFieldValue(
                        CLASS_NAME, "myLong:J", 0xFFFFFFFFFL);

        VMTester.testExpectedClassState(CLASS_NAME, "TestStaticPutWide()V", initial, classNameToExpectedFieldValue);
    }

    @Test
    public void TestStaticPutObject() {
        SparseArray<Object> initial = VMTester.buildRegisterState(0, "Do not pray for an easy life");
        Map<String, Map<String, Object>> classNameToExpectedFieldValue = VMTester.buildClassNameToFieldValue(
                        CLASS_NAME, "myString:Ljava/lang/String;", "Do not pray for an easy life");

        VMTester.testExpectedClassState(CLASS_NAME, "TestStaticPutObject()V", initial, classNameToExpectedFieldValue);
    }

    @Test
    public void TestStaticPutBoolean() {
        SparseArray<Object> initial = VMTester.buildRegisterState(0, true);
        Map<String, Map<String, Object>> classNameToExpectedFieldValue = VMTester.buildClassNameToFieldValue(
                        CLASS_NAME, "myBoolean:Z", true);

        VMTester.testExpectedClassState(CLASS_NAME, "TestStaticPutBoolean()V", initial, classNameToExpectedFieldValue);
    }

    @Test
    public void TestStaticPutByte() {
        SparseArray<Object> initial = VMTester.buildRegisterState(0, (byte) 0xFF);
        Map<String, Map<String, Object>> classNameToExpectedFieldValue = VMTester.buildClassNameToFieldValue(
                        CLASS_NAME, "myByte:B", (byte) 0xFF);

        VMTester.testExpectedClassState(CLASS_NAME, "TestStaticPutByte()V", initial, classNameToExpectedFieldValue);
    }

    @Test
    public void TestStaticPutChar() {
        SparseArray<Object> initial = VMTester.buildRegisterState(0, '!');
        Map<String, Map<String, Object>> classNameToExpectedFieldValue = VMTester.buildClassNameToFieldValue(
                        CLASS_NAME, "myChar:C", '!');

        VMTester.testExpectedClassState(CLASS_NAME, "TestStaticPutChar()V", initial, classNameToExpectedFieldValue);
    }

    @Test
    public void TestStaticPutShort() {
        SparseArray<Object> initial = VMTester.buildRegisterState(0, (short) 0x4242);
        Map<String, Map<String, Object>> classNameToExpectedFieldValue = VMTester.buildClassNameToFieldValue(
                        CLASS_NAME, "myShort:S", (short) 0x4242);

        VMTester.testExpectedClassState(CLASS_NAME, "TestStaticPutShort()V", initial, classNameToExpectedFieldValue);
    }
}
