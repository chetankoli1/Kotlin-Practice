import java.util.Scanner

fun main() {
    for (i in 1..5){
        for (j in 1..41){
            if ((i == 2 && j == 2) || (i == 2 && j == 5) || (i == 2 && j == 3) || (i == 2 && j == 4) ||
                (i == 4 && j == 1) || (i == 4 && j == 2) || (i == 4 && j == 3) || (i == 4 && j == 4) ||
                (i == i && j == 6) || (i == 2 && j == 8) || (i == 2 && j == 9) ||(i == 2 && j == 10) ||
                (i == 4 && j == 8) || (i == 4 && j == 9) ||(i == 4 && j == 10) || (i == 5 && j == 8) || (i == 5 && j == 9) ||(i == 5 && j == 10) ||
                (i == i && j == 12) || (i == 2 && j == 14) || (i == 2 && j == 15) ||(i == 2 && j == 16) || (i == 2 && j ==17) ||
                (i == 5 && j == 13) || (i == 5 && j == 14) || (i == 5 && j == 16) || (i == 5 && j == 17) ||
                (i == 3 && j == 14) || (i == 3 && j == 16) || (i == 3 && j == 17) ||
                (i == i && j == 18) || (i == 2 && j == 20) || (i == 2 && j == 21) ||(i == 2 && j == 22) ||
                (i == 4 && j == 20) || (i == 4 && j == 21) ||(i == 4 && j == 22) || (i == 5 && j == 20) || (i == 5 && j == 21) ||(i == 5 && j == 22) ||
                (i == i && j == 24) || (i == 2 && j == 26) || (i == 2 && j == 27) ||(i == 2 && j == 28) || (i == 4 && j == 26) || (i == 4 && j == 28) ||
                (i == 4 && j == 29) || (i == 5 && j == 26) || (i == 5 && j == 27) || (i == 5 && j == 29) || (i == i && j == 30) ||
                (i == 4 && j == 32) || (i == 4 && j == 33) ||(i == 4 && j == 34) || (i == 2 && j == 32) || (i == 2 && j == 33) ||(i == 2 && j == 34) ||
                (i == 2 && j == 35) ||
                (i == i && j == 36) ||
                (i == 2 && j == 38) || (i == 2 && j == 39) ||(i == 2 && j == 40) || (i == 4 && j == 37) || (i == 4 && j == 38) ||(i == 4 && j == 39) ||
                (i == 4 && j == 40)){
                print("  ")
            }else {
                print("* ")
            }
        }
        println(" ")
    }
}