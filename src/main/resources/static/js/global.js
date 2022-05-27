/**
Loading translations
 */

var set_locale_to = function(locale) {
	if (locale)
		$.i18n().locale = locale;
	$('body').i18n();
};

jQuery(function($) {
	$.i18n().load({
		'en': './js/i18n/en.json',
		'es': './js/i18n/es.json'
	}).done(function() {
		console.log("PRUEBA"+set_locale_to(url('?locale')));

		History.Adapter.bind(window, 'statechange', function() {
			console.log("PRUEBA2"+set_locale_to(url('?locale')));
		});

		$('.switch-locale').on('click', 'a', function(e) {
			e.preventDefault();
			History.pushState(null, null, "?locale=" + $(this).data('locale'));
		});
	});
});