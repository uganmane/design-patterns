package test1;


import java.util.ArrayList;
import java.util.List;

/**
 * 课铃时间
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/14 10:56
 */
public class BellEventSource {
    private List<EventListener> listeners = new ArrayList<>();

    public void addListener(EventListener listener) {
        listeners.add(listener);
    }
    public void removeListener(EventListener listener) {
        listeners.remove(listener);
    }

    //事件触发器：敲钟，当铃声sound的值发生变化时，触发事件。
    public void ring(boolean sound) {
        String type = sound ? "上课铃" : "下课铃";
        System.out.println(type + "响！");
        RingEvent event = new RingEvent(sound);
        notifies(event);    //通知注册在该事件源上的所有监听器
    }
    //当事件发生时,通知绑定在该事件源上的所有监听器做出反应（调用事件处理方法）
    protected void notifies(RingEvent e) {
        for (EventListener listener : listeners) {
            listener.heardBell(e);
        }
    }

}
