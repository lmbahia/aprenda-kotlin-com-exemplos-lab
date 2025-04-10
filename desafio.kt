
enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel:Nivel) {

    val inscritos = mutableListOf<String>()

    fun matricular(vararg usuario: String) {
        inscritos.addAll(usuario);
        for(inscrito in inscritos)
        {
            println("Mátricula do aluno '$inscrito' realizada para a formação $nome de nível $nivel")
        }
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")

    }
}

fun main() {
    /*TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")*/
    val aluno1 : Usuario = Usuario("Bebeu");
    val aluno2 : Usuario = Usuario("Lineuzinho");
    val aluno3 : Usuario = Usuario("Agostinho");
    val aluno4 : Usuario = Usuario("Nênê");
    val aluno5 : Usuario = Usuario("Tuco");

    //val nivel = Nivel();

    val conteudo1 = ConteudoEducacional("Introdução a Kotlin", 60)
    val conteudo2 = ConteudoEducacional("Funções em Kotlin", 90)

    val formacaoKotlinBasico = Formacao("Kotlin Básico", listOf(conteudo1, conteudo2), Nivel.BASICO)
    formacaoKotlinBasico.matricular(aluno2.nome, aluno3.nome, aluno1.nome, aluno5.nome, aluno4.nome);
    println(formacaoKotlinBasico)


}
