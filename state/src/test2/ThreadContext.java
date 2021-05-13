package test2;


/**
 * 线程上下文
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 17:59
 */
public class ThreadContext {
    private ThreadState state;

    public ThreadState getState() {
        return state;
    }

    public void setState(ThreadState state) {
        this.state = state;
    }

    public ThreadContext() {
        this.state = new New();
    }

    public void start() {
        ((New) state).start(this);
    }
    public void getCPU() {
        ((Runnable) state).getCPU(this);
    }
    public void suspend() {
        ((Running) state).suspend(this);
    }
    public void stop() {
        ((Running) state).stop(this);
    }
    public void resume() {
        ((Blocked) state).resume(this);
    }
}
