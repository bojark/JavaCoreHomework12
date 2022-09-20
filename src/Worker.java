public class Worker {
    OnTaskDoneListner callback;
    OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListner callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 1; i <= 100; i++) {
            if (i == 33) {
                errorCallback.onError("Дело " + i + " провалено.");
            } else {
                callback.onDone("Дело " + i + " сделано.");
            }

        }
    }
}


