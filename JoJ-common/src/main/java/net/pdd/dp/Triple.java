package net.pdd.dp;

import com.google.common.collect.Lists;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class Triple {
    private static List<Triple> list = Lists.newArrayList(new Triple(1), new Triple(2), new Triple(3));
    private int id;
    private Triple(int id) {
        this.id = id;
    }

    public static Triple getInstance(int id) {
        return list.get(id);
    }
}