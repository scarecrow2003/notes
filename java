1. new Integer(70).toString.intern()
2. -Xmx256m -Xms128m -XX:MaxPermSize=246M -verbose:gc 
3. -Xmn64m //young generation in heap
4. -XX:HeapDumpOnOutOfMemory
