package unsafe.sort;

import cn.lightfish.StreamB.memory.unsafe.utils.JavaUtils;

/**
 * Created by zagnix on 2016/6/6.
 */
public class HashPartitioner {
    private int index =0;
    public HashPartitioner(int i) {
        this.index = i;
    }
    public int getPartition(String key){
        return JavaUtils.nonNegativeMod(key.hashCode(), index);
    }

}
