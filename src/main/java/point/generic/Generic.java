package point.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

/**
 * Created by Vigor on 2017/2/23.
 * 泛型练习
 * 带类型参数的类
 */
public class Generic<T> {
    private final Stack<String> stack = new Stack<>();
    private final T arg;

    public Generic(T arg) {
        this.arg = arg;
    }

    public T getArg() {
        return arg;
    }

    /**
     * 带类型参数方法
     * @param item
     * @param <S>
     */
    public <S> void push(S item) {
        stack.push(String.valueOf(item));
    }

    /**
     * 遍历堆栈
     * @return
     */
    public String getStack() {
        String result = "";
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }

    /**
     * Class的泛型处理
     * String.class类型代表 Class<String>
     * @param c Class
     * @param n Class对象数
     * @param <C>
     * @return
     */
    public <C> Collection<C> makeList(Class<C> c, int n) {
        Collection<C> collection = new ArrayList<>();
        try {
            for (int i = 0; i < n; i++) {
                C item = c.newInstance();
                collection.add(item);
            }
        }
        catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return collection;
    }
}
