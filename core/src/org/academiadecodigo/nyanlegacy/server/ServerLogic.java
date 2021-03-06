package org.academiadecodigo.nyanlegacy.server;

/**
 * Created by joaoc on 07/07/2016.
 */
public final class ServerLogic {

    public static final int TILESIZE = 21;
    private static final int CELLSIZE = 50;
    /*
    ServerLogic singleton definition.
    */
    private static ServerLogic serverLogic = null;

    /*
    properties and methods
     */
    private static boolean[][] matrix = new boolean[TILESIZE][TILESIZE];

    private ServerLogic() {

    }

    public synchronized static ServerLogic getInstance() {

        if (serverLogic == null) {
            serverLogic = new ServerLogic();
        }

        return serverLogic;
    }

    /**
     * This method receives a col and a row and it evaluates if there was already a player on that position. If yes, then there's a collision.
     * If there was not a collision, the statePositionState() method is called
     *
     * @param col
     * @param row
     * @return collision state
     */
    public boolean collision(int col, int row) {

        if (matrix[col][row]) {
            return true;
        }
        return false;
    }

    /**
     * this method sets the position state to true which means that, the player it´s leaving his trace on that position.
     *
     * @param col
     * @param row
     */
    public void setPositionState(int col, int row) {

        matrix[col][row] = true;

    }

}
