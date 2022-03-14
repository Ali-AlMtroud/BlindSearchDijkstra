import java.util.*;

public class UniformCost {
    static ArrayList<Grid> VisitedGrid;
    PriorityQueue<Grid> Queue_State;

    public UniformCost() {
        VisitedGrid = new ArrayList<>();
        this.Queue_State = new PriorityQueue<>(new CompareGrid());
    }


    public Grid UniformSearch(Grid Maze) {

        Queue_State.add(Maze);

        System.out.println(Maze.Cost);
        System.out.println(Maze);
        while (!Queue_State.isEmpty()) {
            Grid Current = Queue_State.poll();
            if (!VisitedGrid.contains(Current)) {
                VisitedGrid.add(Current);
            }

            if (Current.EndOfGame() == GameState.Player_is_Winner) {
                System.out.println(Current.Cost);
                return Current;
            } else {

                PriorityQueue<Grid> children = Current.GetNextGridUniformCost();
                for (Grid grid : children) {
                    if (!VisitedGrid.contains(grid)) {
                        Queue_State.add(grid);
                        // VisitedGrid.add(grid);
                    }
                    // if Child  is Visited
                    else {
                        // Compare Child With all Grid Visited and Remove Grid With height Cost
                        for (Grid iterator : VisitedGrid) {
                            if (iterator.Cost > grid.Cost) {
                                VisitedGrid.remove(iterator);
                                VisitedGrid.add(grid);
                                Queue_State.add(grid);
                            }
                        }
                    }
                }
            }
        }
        return null;

    }


}