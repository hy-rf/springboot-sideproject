const { createApp, ref } = Vue;

    createApp({
      setup() {
        const selectedFile = ref(null);
        const message = ref('');
        const error = ref('');
        const musicList = ref([]);

        const handleFileUpload = (event) => {
          selectedFile.value = event.target.files[0];
        };

        const uploadMusic = () => {
          if (!selectedFile.value) {
            error.value = "Please select a file first.";
            message.value = '';
            return;
          }

          // Simulate upload by creating a local object URL
          const url = URL.createObjectURL(selectedFile.value);
          musicList.value.push({
            name: selectedFile.value.name,
            url: url
          });

          message.value = "Upload successful!";
          error.value = '';
          selectedFile.value = null;
        };

        return {
          selectedFile,
          message,
          error,
          musicList,
          handleFileUpload,
          uploadMusic
        };
      }
    }).mount('#app');