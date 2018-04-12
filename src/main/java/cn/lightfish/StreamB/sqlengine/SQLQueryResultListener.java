package cn.lightfish.StreamB.sqlengine;


public interface SQLQueryResultListener<T> {

	public void onResult(T result);

}
