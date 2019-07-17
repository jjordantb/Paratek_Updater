import io.paratek.rs.analysis.hook.Game;
import io.paratek.rs.loader.Frame;
import io.paratek.rs.util.JarHandler;

import java.io.File;

public class RunningTest {

    public static void main(String[] args) {
        final JarHandler handler = new JarHandler(Game.OSRS, new File("/home/sysassist/IdeaProjects/deob/src/main/resources/gamepack_180-deob.jar"));
        Frame.start(handler);
    }

}
