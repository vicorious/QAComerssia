import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JacksonXmlRootElement(localName = "transaccion")
public class Dao{

    @JacksonXmlProperty(localName = "USUARIO")
    private String usuario;
    @JacksonXmlProperty(localName = "CLAVE")
    private String clave;
    
    @JacksonXmlProperty(localName = "ENCDescripcion")
    private String ENCDescripcion;
    @JacksonXmlProperty(localName = "GMVCodigo")
    private String GMVCodigo;
    @JacksonXmlProperty(localName = "MOVCodigo")
    private String MOVCodigo;
    @JacksonXmlProperty(localName = "movimiento")
    private String movimiento;
    @JacksonXmlProperty(localName = "USUCodigo")
    private String USUCodigo;
    @JacksonXmlProperty(localName = "CAJCodigo")
    private String CAJCodigo;
    @JacksonXmlProperty(localName = "IDEMP")
    private String IDEMP;
    @JacksonXmlProperty(localName = "ALMCodigo")
    private String ALMCodigo;
    @JacksonXmlProperty(localName = "ALMNombre")
    private String ALMNombre;
    @JacksonXmlProperty(localName = "MONCodigo")
    private String MONCodigo;
    @JacksonXmlProperty(localName = "ENCFechaTrx")
    private String ENCFechaTrx;
    @JacksonXmlProperty(localName = "ENCHoraTrx")
    private String ENCHoraTrx;
    @JacksonXmlProperty(localName = "ENCModo")
    private String ENCModo;
    @JacksonXmlProperty(localName = "ENCTipoProc")
    private String ENCTipoProc;
    @JacksonXmlProperty(localName = "ENCConsTrx")
    private String ENCConsTrx;
    @JacksonXmlProperty(localName = "ENCTasaConversion")
    private String ENCTasaConversion;
    @JacksonXmlProperty(localName = "ENCTotalReferencias")
    private String ENCTotalReferencias;
    @JacksonXmlProperty(localName = "ENCBruto")
    private String ENCBruto;
    @JacksonXmlProperty(localName = "ENCDescuento")
    private String ENCDescuento;
    @JacksonXmlProperty(localName = "ENCPagNoVenta")
    private String ENCPagNoVenta;
    @JacksonXmlProperty(localName = "ENCVenta")
    private String ENCVenta;
    @JacksonXmlProperty(localName = "ENCImpuestos")
    private String ENCImpuestos;
    @JacksonXmlProperty(localName = "ENCComision")
    private String ENCComision;
    @JacksonXmlProperty(localName = "ENCNeto")
    private String ENCNeto;
    @JacksonXmlProperty(localName = "ENCRecaudo")
    private String ENCRecaudo;
    @JacksonXmlProperty(localName = "ENCImpuestoAsumido")
    private String ENCImpuestoAsumido;
    @JacksonXmlProperty(localName = "ENCPuntos")
    private String ENCPuntos;
    @JacksonXmlProperty(localName = "ENCEstadoLinea")
    private String ENCEstadoLinea;
    @JacksonXmlProperty(localName = "ENCRespuesta")
    private String ENCRespuesta;
    @JacksonXmlProperty(localName = "ENCDescRespuesta")
    private String ENCDescRespuesta;

    @JacksonXmlProperty(localName = "ICPPresentacion")
    private ICPPresentacion ICPPresentacion;
    @JacksonXmlProperty(localName = "ICPDescripcion")
    private ICPDescripcion ICPDescripcion;
    @JacksonXmlProperty(localName = "ICPCadena")
    private ICPCadena ICPCadena;
    @JacksonXmlProperty(localName = "ICPLetra")
    private ICPLetra ICPLetra;

    @JacksonXmlProperty(localName = "ICPPresentacion")
    private ICPPresentacion ICPPresentacion;
    @JacksonXmlProperty(localName = "ICPDescripcion")
    private ICPDescripcion ICPDescripcion;
    @JacksonXmlProperty(localName = "ICPCadena")
    private ICPCadena ICPCadena;
    @JacksonXmlProperty(localName = "ICPLetra")
    private ICPLetra ICPLetra;

    @JacksonXmlProperty(localName = "REFCodClasificacion")
    private REFCodClasificacion REFCodClasificacion;
    @JacksonXmlProperty(localName = "REFCodigo1")
    private REFCodigo1 REFCodigo1;
    @JacksonXmlProperty(localName = "REFCodigo2")
    private REFCodigo2 REFCodigo2;
    @JacksonXmlProperty(localName = "REFNombreCorto")
    private REFNombreCorto REFNombreCorto;
    @JacksonXmlProperty(localName = "REFNombreLargo")
    private REFNombreLargo REFNombreLargo;
    @JacksonXmlProperty(localName = "CARCodigo1")
    private CARCodigo1 CARCodigo1;
    @JacksonXmlProperty(localName = "REFPrecioLista")
    private REFPrecioLista REFPrecioLista;
    @JacksonXmlProperty(localName = "IRFBruto")
    private IRFBruto IRFBruto;
    @JacksonXmlProperty(localName = "IRFDescuento")
    private IRFDescuento IRFDescuento;
    @JacksonXmlProperty(localName = "IRFPago")
    private IRFPago IRFPago;
    @JacksonXmlProperty(localName = "IRFCantidad")
    private IRFCantidad IRFCantidad;
    @JacksonXmlProperty(localName = "IRFValorImpuesto")
    private IRFValorImpuesto IRFValorImpuesto;
    @JacksonXmlProperty(localName = "IRFImpuesto")
    private IRFImpuesto IRFImpuesto;
    @JacksonXmlProperty(localName = "REFEsCombo")
    private REFEsCombo REFEsCombo;
    @JacksonXmlProperty(localName = "REFUltimoCosto")
    private REFUltimoCosto REFUltimoCosto;
    @JacksonXmlProperty(localName = "PRVCodigo")
    private PRVCodigo PRVCodigo;
    @JacksonXmlProperty(localName = "REFManejaLotes")
    private REFManejaLotes REFManejaLotes;
    @JacksonXmlProperty(localName = "REFFactorConversion")
    private REFFactorConversion REFFactorConversion;
    @JacksonXmlProperty(localName = "REFInventario")
    private REFInventario REFInventario;
    @JacksonXmlProperty(localName = "REFEsParaVenta")
    private REFEsParaVenta REFEsParaVenta;
    @JacksonXmlProperty(localName = "estado")
    private estado estado;
    @JacksonXmlProperty(localName = "IRFPagNoVenta")
    private IRFPagNoVenta IRFPagNoVenta;
    @JacksonXmlProperty(localName = "IRFVenta")
    private IRFVenta IRFVenta;
    @JacksonXmlProperty(localName = "IRFValorImpuestoNeto")
    private IRFValorImpuestoNeto IRFValorImpuestoNeto;
    @JacksonXmlProperty(localName = "IRFComision")
    private IRFComision IRFComision;
    @JacksonXmlProperty(localName = "IRFNeto")
    private IRFNeto IRFNeto;
    @JacksonXmlProperty(localName = "REFCodigoIngresado")
    private REFCodigoIngresado REFCodigoIngresado;
    @JacksonXmlProperty(localName = "RREFPuntos")
    private RREFPuntos RREFPuntos;
    
    @JacksonXmlProperty(localName = "ICPPresentacion")
    private ICPPresentacion ICPPresentacion;
    @JacksonXmlProperty(localName = "ICPDescripcion")
    private ICPDescripcion ICPDescripcion;
    @JacksonXmlProperty(localName = "ICPCadena")
    private ICPCadena ICPCadena;
    @JacksonXmlProperty(localName = "ICPLetra")
    private ICPLetra ICPLetra;

}