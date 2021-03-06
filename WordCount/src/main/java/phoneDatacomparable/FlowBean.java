package phoneDatacomparable;

import lombok.Getter;
import lombok.Setter;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * @Description:
 * @Author: Axin
 * @Date: Create in 14:09 2019/7/28
 */
@Getter
@Setter
public class FlowBean implements WritableComparable<FlowBean> {



    private long upFlow;

    private long downFlow;

    private long sumFlow;

    public FlowBean() {
    }

    public FlowBean(long upFlow, long downFlow) {
        this.upFlow = upFlow;
        this.downFlow = downFlow;
        this.sumFlow = upFlow + downFlow;
    }


    @Override
    public String toString() {
        return upFlow + "\t" + downFlow + "\t" + sumFlow;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeLong(upFlow);
        out.writeLong(downFlow);
        out.writeLong(sumFlow);

    }

    @Override
    public void readFields(DataInput in) throws IOException {
        this.upFlow = in.readLong();
        this.downFlow = in.readLong();
        this.sumFlow = in.readLong();

    }


    /**
     * 降序 -1： 升序：1
     * @param o
     * @return
     */
    @Override
    public int compareTo(FlowBean o) {
       return this.sumFlow > o.getSumFlow() ? -1 : 1;

    }
}
