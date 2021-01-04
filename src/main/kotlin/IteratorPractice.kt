fun main(args:Array<String>){
    //image1.png ~ image9.png 까지 출력
    for(num in 1..9){
        println("image${num}.png")
    }

    for(idx in 1..9 step 2){
        println(idx)
    }

    //배열과 List 새성
    var ar = arrayOf<String>(
        "다크베이지", "매트블랙", "라이트그레이", "화이트", "그린", "다크그레이"
    )
    var list = listOf<String>(
        "블랙", "화이트", "프로덕트 레드", "그린", "블루"
    )

    //인덱스를 idx에 대입
    for(idx in ar.indices){
        println(idx)
    }

    //인덱스와 값을 idx에 대입
    for(idx in list.withIndex()){
        println(idx)
    }
}