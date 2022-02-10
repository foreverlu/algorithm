import sun.security.ssl.HandshakeOutStream;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=~/data
 */
public class Test {

    private static byte[] _M = new byte[1024 * 1024];
    public static void main(String[] args) {

        List<byte[]> list = new ArrayList<>();
        while(true){
            byte[] _M = new byte[1024 * 1024];
            list.add(_M);
        }


    }


}


