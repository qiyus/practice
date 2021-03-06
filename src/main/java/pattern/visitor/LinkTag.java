package pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vigor on 2017/7/16.
 * Link
 */
class LinkTag extends Node {
    /**
     * 子节点列表
     */
    private final List<Node> child = new ArrayList<>();

    /**
     * 追加子节点
     */
    @Override
    public void add(Node node)  {
        child.add(node);
    }

    /**
     * 取得子节点列表
     * @return 子节点列表
     */
    @Override
    public List<Node> getChild() {
        return child;
    }

    /**
     * 内联化处理
     * @param extractor xml提取器
     * @return xml
     */
    @Override
    public String accept(TextExtractor extractor) {
        return extractor.visitLinkTag(this);
    }
}
