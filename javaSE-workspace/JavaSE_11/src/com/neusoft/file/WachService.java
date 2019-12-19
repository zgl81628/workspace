package com.neusoft.file;

import java.nio.file.*;

public class WachService {

    public static void main(String[] args) {
        /*监控目标路径 */
        Path path = Paths.get("e:/aaa");
        try {
            /* 创建文件监控对象 */
            WatchService watchService = FileSystems.getDefault().newWatchService();
            /* 注册文件监控的所有事件类型 */
            path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE,
                    StandardWatchEventKinds.ENTRY_MODIFY);
            /* 循环监测文件 */
            while (true) {
                WatchKey watchKey = watchService.take();
                /* 迭代触发事件的所有文件 */
                for (WatchEvent<?> event : watchKey.pollEvents())
                    System.out.println(event.context().toString() + " 事件类型："
                            + event.kind());
                if (!watchKey.reset())
                    return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
