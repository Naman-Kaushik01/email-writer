console.log("Content script loaded");

const observer = new MutationObserver((mutations) => {
    mutations.forEach((mutation) => {
        if (mutation.addedNodes.length > 0) {
            mutation.addedNodes.forEach((node) => {
                if (node.nodeType === Node.ELEMENT_NODE) {
                    const composeButton = node.querySelector('div[aria-label="Compose"]');
                    if (composeButton) {
                        console.log("Compose button found");
                        addAssistantButton(composeButton);
                    }
                }
            });
        }
    }