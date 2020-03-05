package mat.ned.mechanics.maps.worldMap;

import java.io.IOException;

public class ValleyOfAvalon extends WorldMap {

    private static final int DEFAULT_START_ROW = 28;
    private static final int DEFAULT_START_COLUMN = 11;


    public ValleyOfAvalon() throws IOException {
        splitLoadedDataToWorldMapArray("src/main/resources/WorldMap1.wmap");
    }

    @Override
    public int getDefaultStartRow() {
        return DEFAULT_START_ROW;
    }

    @Override
    public int getDefaultStartColumn() {
        return DEFAULT_START_COLUMN;
    }

    @Override
    public boolean isAccessible() {
        return true;
    }

}
