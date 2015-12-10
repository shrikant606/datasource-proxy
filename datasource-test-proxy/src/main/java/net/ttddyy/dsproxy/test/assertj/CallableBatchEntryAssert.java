package net.ttddyy.dsproxy.test.assertj;

import net.ttddyy.dsproxy.test.BatchExecutionEntry;
import net.ttddyy.dsproxy.test.assertj.data.BatchParameter;
import org.assertj.core.api.AbstractAssert;

import java.sql.SQLType;

/**
 * @author Tadaya Tsuyukubo
 * @since 1.4
 */
public class CallableBatchEntryAssert extends AbstractAssert<CallableBatchEntryAssert, BatchExecutionEntry> {

    public CallableBatchEntryAssert(BatchExecutionEntry actual) {
        super(actual, CallableBatchEntryAssert.class);
    }

    public CallableBatchEntryAssert containsParam(int paramIndex, Object value) {
        return this;
    }

    public CallableBatchEntryAssert containsParam(String paramName, Object value) {
        return this;
    }

    public CallableBatchEntryAssert containsOutParam(int paramIndex, int sqlType) {
        return null;
    }

    public CallableBatchEntryAssert containsOutParam(int paramIndex, SQLType sqlType) {
        return null;
    }

    public CallableBatchEntryAssert containsOutParam(String paramName, int sqlType) {
        return null;
    }

    public CallableBatchEntryAssert containsOutParam(String paramName, SQLType sqlType) {
        return null;
    }

    public CallableBatchEntryAssert containsNullParam(int index, int sqlType) {
        return null;
    }

    public CallableBatchEntryAssert containsNullParam(int index) {
        return null;
    }

    public CallableBatchEntryAssert containsNullParam(String name, int sqlType) {
        return null;
    }

    public CallableBatchEntryAssert containsNullParam(String name) {
        return null;
    }


    public CallableBatchEntryAssert containsParams(BatchParameter... params) {
        return null;
    }

    public CallableBatchEntryAssert containsParamKey(Object params) {
        // TODO: they should be either string or int
        return null;
    }

    public CallableBatchEntryAssert containsParamKeys(Object... params) {
        // TODO: they should be either string or int
        return null;
    }

    public CallableBatchEntryAssert containsParamIndex(int paramIndexe) {
        return null;
    }

    public CallableBatchEntryAssert containsParamIndexes(int... paramIndexes) {
        return null;
    }

    public CallableBatchEntryAssert containsParamName(String paramName) {
        return null;
    }

    public CallableBatchEntryAssert containsParamNames(String... paramNames) {
        return null;
    }

}
