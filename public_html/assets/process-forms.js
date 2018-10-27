(function($){

    $(document).ready(function() {

        // CHECKBOX MAX 3
        var checkGroup = 0;
        $('.checkbox-max-3').change(function() {
            if(this.checked) {
                checkGroup++;
            } else {
                checkGroup--;
            }
            if(checkGroup > 3){
                $( this ).prop( "checked", false );
                checkGroup--;
                $("#top-3-message").html("You've selected your top 3. Unselect an option to choose this option.");
            } else {
                if(checkGroup == 3){
                    $("#top-3-message").html("Great! Click the 'Get Matched' button to continue." );
                } else {
                    $("#top-3-message").html("Choose up to " + ( 3 - checkGroup ) + " more." );
                }
            }
        });

        $( "#register-interests" ).submit(function( event ) {
            event.preventDefault();

            // var person = {
            //     name: $("#id-name").val(),
            //     address:$("#id-address").val(),
            //     phone:$("#id-phone").val()
            // }
            var person = {
                name: 'Test'
            }

            $("#top-3-message").html('submitting');

            $.ajax({
                url: 'server-pipe.php',
                type: 'post',
                dataType: 'json',
                contentType: 'application/json',
                success: function (data) {
                    console.log('done');
                    $("#top-3-message").html(data.msg);
                },
                data: JSON.stringify(person)
            });


            $.post('server-pipe.php', person, function(response){
                console.log(response);
            });
        });

    });

})(jQuery);