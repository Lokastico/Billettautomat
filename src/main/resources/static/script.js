$(() => {
    $("#button1").click(() => {

        const Fornavn = $("#fnavn");
        const Etternavn = $("#enavn");
        const Epost = $("#epost");
        const Filmen = $("#filmen");
        const Antall = $("#antall");
        const Telefonnummer = $("#nummer");

        const kunde = {
            fnavn: Fornavn.val(),
            enavn: Etternavn.val(),
            epost: Epost.val(),
            filmen: Filmen.val(),
            antall: Antall.val(),
            nummer: Telefonnummer.val()
        };

        if (inputvalidering(kunde)) {
            $.post(lagringserver + "/kunder", kunde, () => hent());
            Fornavn.val("");
            Etternavn.val("");
            Epost.val("");
            Filmen.val("");
            Antall.val("");
            Telefonnummer.val("");
        } else {
            return ("Du må fylle inn alle felter.");
        }
    });

    $("#button2").click(() => {
        $.ajax(lagringserver + "/kunder", {
            type: 'DELETE',
            success: () => hent(),
            error: (jqXhr, textStatus, errorMessage) => {return (errorMessage)}
        });
    });

});

const hent = () => $.get(lagringserver + "/kunder", arrayTilBilletter => formater(arrayTilBilletter));

// Må ha litt bedre inputvalidering enn det her
const inputvalidering = kunde =>{
    if(kunde.fnavn==="")return false
    else if(kunde.enavn==="")return false
    else if(kunde.epost==="")return false
    else if(kunde.filmen==="")return false
    else if(kunde.antall==="" || kunde.antall ==="0")return false
    else return kunde.nummer !== "";
}


const formater = arrayTilBilletter => {
    let ut = "<table><tr><th>Fornavn</th><th>Etternavn</th><th>Epost</th><th>Filmen</th><th>Antall</th><th>Telefonnummer</th></tr>";

    for(let billetter of arrayTilBilletter){
        ut += "<tr><td>" + billetter.fnavn + "</td><td>" + billetter.enavn +"</td><td>" + billetter.epost + "</td><td>"
            + billetter.filmen +"</td><td>" + billetter.antall +"</td><td>" + billetter.nummer + "</td></tr>";
    }
    ut += "</table>";

    $("#billettene").html(ut);
}
