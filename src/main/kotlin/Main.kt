fun main() {
    var cocaco = Loja()
    cocaco.CNPJ = 10512000125L
    cocaco.NumeroDeFuncionarios = 60

    var Luan = Vendedor()
    Luan.codigo = 6

    var Joao = Cliente()
    Joao.nome = "Joao"
    Joao.endereco = "Rezende costa"

    var fornecedor = Fornecedor()
    fornecedor.produto = "refrigerante"
    fornecedor.distribuidora = "Trevizan"

    var cocacola = Produto()
    cocacola.validade = "25 dias"

    var venda = Venda()
    venda.MetaDeVendas = 500

    var trevizan = Transportadora()
    trevizan.motorista = "Roberto"


}